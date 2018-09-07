package com.fnproject.springframework.function.testfns;

import com.fnproject.fn.api.FnConfiguration;
import com.fnproject.fn.api.FunctionInvoker;
import com.fnproject.fn.api.RuntimeContext;
import com.fnproject.springframework.function.SpringCloudFunctionInvoker;
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ContextFunctionCatalogAutoConfiguration.class)
public class EmptyFunctionConfig {
    @FnConfiguration
    public static void configure(RuntimeContext ctx) {
        ctx.addInvoker(new SpringCloudFunctionInvoker(EmptyFunctionConfig.class), FunctionInvoker.Phase.Call);
    }

    public void handleRequest() {
    }

}
