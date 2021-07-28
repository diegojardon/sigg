package mx.gluo.management.evaluationservice.controller;

import mx.gluo.management.evaluationservice.model.Evaluation;
import mx.gluo.management.evaluationservice.proxy.ProfileProxy;
import mx.gluo.management.evaluationservice.service.EvaluationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluationController {

    @Autowired
    private EvaluationsService evaluationsService;

    @Autowired
    private ProfileProxy profileProxy;

    @GetMapping("/evaluations")
    public Evaluation getEvaluations(@RequestHeader("id") String username){

        Evaluation evaluation = profileProxy.getUserProfile(username);
        return evaluationsService.getEvaluationsByUser(evaluation);
    }
}
