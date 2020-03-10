package com.rabbit.product.rabbit;

import com.rabbit.product.entity.DemoRequestData;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Resource
    private SendMessage sendMessage;

    private String queueName;
    @RequestMapping(value = "sendQueue", method = RequestMethod.POST)
    public Response sendQueueMessage(@RequestBody Map<String, String> data){
        String mess = data.get("mess");
        sendMessage.send(mess);
        return Response.ok();
    }

    @RequestMapping(value = "sendTopic", method = RequestMethod.POST)
    public Response sendTopicMessage(@RequestBody Map<String, String> data){
        String mess = data.get("mess");
        System.out.println(mess);
        Person person = new Person();
        person.setAge(20);
        person.setName("ajaja");
        sendMessage.sendTopic("topic.wanke.send", person);
        return Response.ok();
    }

    @RequestMapping(value = "sendRunTopic", method = RequestMethod.POST)
    public Response sendRunTopic(@RequestBody Map<String, String> data){
        String happenTime = data.get("happenTime");
        String eleId = data.get("eleId");
        String doorStatus = data.get("doorStatus");
        String runMode = data.get("runMode");
        String direction = data.get("direction");
        String DTQDCS = data.get("DTQDCS");
        String DTYXSJ = data.get("DTYXSJ");
        String loadPercent = data.get("loadPercent");
        String runStatus = data.get("runStatus");
        String onlineStatus = data.get("onlineStatus");
        String floor = data.get("floor");

        EleRunMq eleRunMq = new EleRunMq();
        eleRunMq.setHAPPENTIME(happenTime);
        eleRunMq.setELE_ID(eleId);
        eleRunMq.setDOOR_STATUS(doorStatus);
        eleRunMq.setRUNMODE_CODE(runMode);
        eleRunMq.setDIRECTION(direction);
        eleRunMq.setDTQDCS(DTQDCS);
        eleRunMq.setDTYXSJ(DTYXSJ);
        eleRunMq.setLOAD_PERCENT(loadPercent);
        eleRunMq.setRUNSTATUS(runStatus);
        eleRunMq.setONLINE_STATUS(onlineStatus);
        eleRunMq.setCURRENTFLOOR(floor);
        sendMessage.sendRunTopic("remes.dtsszt.chg.queue", eleRunMq);
        return Response.ok();
    }

    @RequestMapping(value = "sendTroubleTopic", method = RequestMethod.POST)
    public Response sendTroubleTopic(@RequestBody Map<String, String> data) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String eleContentNo = data.get("eleContentNo");
        String gzxxid = data.get("gzxxid");
        String workorderId = data.get("workorderId");
        String creationDate = data.get("creationDate");
        String chgTime = data.get("chgTime");
        EleTroubleMq eleTroubleMq = new EleTroubleMq();
        eleTroubleMq.setACCEPT_USER_NAME("");
        if(chgTime != null){
            eleTroubleMq.setCHG_TIME(dateFormat.parse(chgTime).getTime());
        }
        eleTroubleMq.setCREATION_DATE(creationDate);
        eleTroubleMq.setELE_CONTRACT_NO(eleContentNo);
        eleTroubleMq.setELE_FAULT_ID("");
        eleTroubleMq.setELE_ID("");
        eleTroubleMq.setEST_ARRIVE_TIME("");
        eleTroubleMq.setEXAMINE("");
        eleTroubleMq.setGZXXID(gzxxid);
        eleTroubleMq.setLEAVE_DATE("");
        eleTroubleMq.setREPAIR("");
        eleTroubleMq.setREPORT("");
        eleTroubleMq.setWORKORDER_ID(workorderId);
        eleTroubleMq.setRESCUED_TIME("");
        //topic.queue.wanke.trouble.te
        sendMessage.sendTroubleTopic("wo_chg", eleTroubleMq);
        return Response.ok();
    }

    @RequestMapping(value = "sendCXTroubleTopic", method = RequestMethod.POST)
    public Response sendCXTroubleTopic(@RequestBody Map<String, String> data) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String eleContentNo = data.get("eleContentNo");
        String gzxxid = data.get("gzxxid");
        String workorderId = data.get("workorderId");
        String creationDate = data.get("creationDate");
        String chgTime = data.get("chgTime");
        String workorderNo = data.get("workorderNo");
        String userName = data.get("userName");
        String accId = data.get("accId");
        EleTroubleMq eleTroubleMq = new EleTroubleMq();
        eleTroubleMq.setACCEPT_USER_NAME("");
        if(chgTime != null){
            eleTroubleMq.setCHG_TIME(dateFormat.parse(chgTime).getTime());
        }
        eleTroubleMq.setCREATION_DATE(creationDate);
        eleTroubleMq.setELE_CONTRACT_NO(eleContentNo);
        eleTroubleMq.setELE_FAULT_ID("");
        eleTroubleMq.setELE_ID("");
        eleTroubleMq.setEST_ARRIVE_TIME("");
        eleTroubleMq.setEXAMINE("");
        eleTroubleMq.setGZXXID(gzxxid);
        eleTroubleMq.setLEAVE_DATE("");
        eleTroubleMq.setREPAIR("");
        eleTroubleMq.setREPORT("");
        eleTroubleMq.setWORKORDER_ID(workorderId);
        eleTroubleMq.setRESCUED_TIME("");
        eleTroubleMq.setWORKORDER_NO(workorderNo);
        eleTroubleMq.setACCEPT_USER_NAME(userName);
        eleTroubleMq.setAccId(accId);
        //topic.queue.wanke.trouble.te
        sendMessage.sendCXTroubleTopic("wo_chg_cx", eleTroubleMq);
        return Response.ok();
    }

    @RequestMapping(value = "sendTest", method = RequestMethod.POST)
    public Response sendTest(@Valid @RequestBody DemoRequestData data, Errors error){
        List<ObjectError> allErrors =  error.getAllErrors();
        if(data!= null && data.getEleContractNoList() != null){

            System.out.println(data.getEleContractNoList().toArray().toString());
        }
        return Response.ok();
    }



}
