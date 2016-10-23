package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource( {

//        classpath:ikasan-datasource-conf.xml
//        classpath:ikasan-transaction-conf.xml
//        classpath:ikasan-transaction-manager-conf.xml
//        classpath:serialiser-service-conf.xml
//        classpath:platform-service-conf.xml
//        classpath:scheduler-service-conf.xml
//        classpath:recoveryManager-service-conf.xml
//        classpath:module-service-conf.xml
//        classpath:topology-conf.xml
//        classpath:topology-tx-conf.xml
//        classpath:ikasan-module-bootstrap-conf.xml
//        classpath:wiretap-service-conf.xml
//        classpath:exclusion-service-conf.xml
//        classpath:error-reporting-service-conf.xml
//        classpath:systemevent-service-conf.xml
//        classpath:configuration-service-conf.xml
//        classpath:hospital-conf.xml
//        classpath:rest-service-conf.xml
//
        "classpath:serialiser-service-conf.xml",
        "classpath:scheduler-service-conf.xml",
        "classpath:error-reporting-service-conf.xml",
        "classpath:recoveryManager-service-conf.xml",
        "classpath:configuration-service-conf.xml",
        "classpath:exclusion-service-conf.xml",
        "classpath:platform-service-conf.xml",
        //"classpath:ikasan-module-bootstrap-conf.xml",
        "classpath:module-service-conf.xml",
        "classpath:systemevent-service-conf.xml",
//        "classpath:replay-service-conf.xml ",

        "classpath:wiretap-service-conf.xml",

        "classpath:monitor-service-conf.xml",
        "classpath:monitor-conf.xml",
        "classpath:shared-conf.xml",

        "classpath:jms-to-jms-flow-conf.xml",
        "classpath:jms-conf.xml",
        "classpath:exception-conf.xml",
        "classpath:ikasan-transaction-conf.xml",
        "classpath:test-conf.xml",
       // "classpath:substitute-components.xml",
        "classpath:h2db-datasource-conf.xml",

} )
public class ConfigClass {
}
