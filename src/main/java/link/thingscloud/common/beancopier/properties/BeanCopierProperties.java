package link.thingscloud.common.beancopier.properties;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author : zhouhailin
 */
@Slf4j
public class BeanCopierProperties {

    static final Properties PROPERTIES = new Properties();

    static {
        InputStream resourceAsStream = BeanCopierProperties.class.getResourceAsStream("/beancopier.properties");
        try {
            PROPERTIES.load(resourceAsStream);
            log.debug("BeanCopierProperties load default beancopier.properties successful.");
        } catch (IOException e) {
            log.error("BeanCopierProperties load default beancopier.properties failed, cause ", e);
        }
        String property = System.getProperty("beancopier.properties");
        if (property != null && !property.isEmpty() && new File(property).isFile()) {
            try {
                PROPERTIES.load(new FileInputStream(property));
                log.info("BeanCopierProperties load {} successful.", property);
            } catch (IOException e) {
                log.error("BeanCopierProperties load custom [{}] failed, cause ", property, e);
            }
        }
        PROPERTIES.forEach((o1, o2) -> log.debug("BeanCopierProperties load {} : {}", o1, o2));
    }

    private BeanCopierProperties() {
    }


}
