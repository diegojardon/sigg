package mx.gluo.management.evaluationservice.controller;

import mx.gluo.management.evaluationservice.model.Evaluation;
import mx.gluo.management.evaluationservice.service.EvaluationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class EvaluationController {

    @Autowired
    private EvaluationsService evaluationsService;

    @GetMapping("/evaluations")
    public Evaluation getEvaluations(){

        return evaluationsService.getEvaluationsByUser();

    }


}
