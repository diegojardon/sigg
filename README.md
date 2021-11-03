# sigg

Sistema de Gestión Test (Evaluaciones, Vacaciones, entre otros)
Pre-requisitos 📋

    Instalar Java 16
    Instalar Node 14 y npm 6
    Instalar Svelte 3
    Instalar Docker
    Contar con una cuenta de Google Cloud Platform (Próximamente)
    Crear un cluster Kubernetes en GKE dentro de GCP (Próximamente)

Instalar y levantar imagen Redis

docker pull redis
docker run --name redis-sigg -p 6379:6379 -d redis

Instalar y levantar imagen de MySQL

docker pull mysql
docker run --name mysql-sigg -e MYSQL_ROOT_PASSWORD=s1gg#Us3r#P4ss -d -p 3307:3306 mysql:8.0.25

Para ingresar a la consola

docker exec -it mysql-sigg bash 

Instalar y levantar servidor Vault en modo desarrollo

vault server -dev

Exportar la dirección del servidor de Vault y el Root Token:

export VAULT_ADDR='http://127.0.0.1:8200'
export VAULT_TOKEN='s.GVB0QK6idh7r35QKwbkoyzXS'

Configurar acceso hacia archivos en carpeta de Evaluaciones en Google Drive

GoogleSheet API con Java
Configurar Conexión a Base de Datos en Vault

Habilitar secrets engine para MySQL

vault secrets enable database

Configuración de la conexión

vault write database/config/sigg  \
plugin_name=mysql-database-plugin \
    connection_url="root:s1gg#Us3r#P4ss@tcp(127.0.0.1:3307)/" \
    allowed_roles="my-role-sigg" \
    username="vaultuser" \
    password="vaultpass"

Configuración del rol creado

vault write database/roles/my-role-sigg \
    db_name=sigg \
    creation_statements="CREATE USER '{{name}}'@'%' IDENTIFIED BY '{{password}}';GRANT SELECT ON *.* TO '{{name}}'@'%';" \
    default_ttl="48h" \
    max_ttl="240h"  

Obtener token de conexión

vault read database/creds/my-role-sigg

Este token obtenido se debe colocar en los siguientes archivos:

    application.yml - config-server
    bootstrap.yml - authorization-service
    bootstrap.yml - user-services

Agregar el secret para JWT dentro de Vault

Se puede obtener de: https://www.grc.com/passwords.htm

vault kv put secret/application jwt.secret=DTFlSuHIV7h8tO45zruW5IBrF3TK9yrdlLdN07oT3c2vJfV3Pzx9rTa1Mhx3UB5

Creación de Estructura en MySQL

Crear la base de datos sigg en MySQL y ejecutar el código sql que se encuentra en el archivo sigg.sql dentro de la ruta application-config
Levantando el Back-End 🚀

Iniciar los proyectos con Gradle en el siguiente orden:

    discovery-server
    config-server

Los demás proyectos se pueden levantar en cualquier orden:

    api-gateway
    authorization-service
    user-services
    evaluation-service

Levantando el Front-End 🚀

Dentro de la ruta sigg-front levantar Svelte

npm run dev

Probando el sitio

El sitio debe quedar desplegado en la siguiente url: http://localhost:5000/
