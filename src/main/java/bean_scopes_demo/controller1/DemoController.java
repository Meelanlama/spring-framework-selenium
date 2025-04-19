package bean_scopes_demo.controller1;

import bean_scopes_demo.model.RequestDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //@Autowired
    private RequestDataModel requestData;

    @Autowired
    public DemoController(RequestDataModel requestData) {
        this.requestData = requestData;
    }

    @GetMapping("/demo")
    private String getObject(){
        return requestData.toString();
    }
}
