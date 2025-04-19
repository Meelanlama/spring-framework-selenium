package bean_scopes_demo.controller2;

import bean_scopes_demo.model.RequestDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    //@Autowired
    private RequestDataModel requestData;

    @Autowired
    public DemoController2(RequestDataModel requestData) {
        this.requestData = requestData;
    }

    @GetMapping("/demo2")
    private String getObject(){
        return requestData.toString();
    }
}
