package pl.sternik.mr.rest.jaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


/**
 * Created by Michal on 25.03.2018.
 */
@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(Store.class);
    }
}
