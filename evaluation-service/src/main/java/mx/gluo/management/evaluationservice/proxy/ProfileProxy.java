package mx.gluo.management.evaluationservice.proxy;

import mx.gluo.management.evaluationservice.model.Evaluation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "user-services", url="localhost:8101")
public interface ProfileProxy {

    @GetMapping("/profile")
    Evaluation getUserProfile(@RequestHeader("id") String username);

}
