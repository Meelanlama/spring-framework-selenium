package bean_scopes_demo.model;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@RequestScope
//@SessionScope
@ApplicationScope
public class RequestDataModel {
    private String requestId;
    private String requestData;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("RequestDataModel is destroyed");
    }

}
