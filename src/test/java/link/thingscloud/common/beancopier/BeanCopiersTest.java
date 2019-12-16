package link.thingscloud.common.beancopier;

import link.thingscloud.common.beancopier.helper.NameValuePair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : zhouhailin
 */
public class BeanCopiersTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newCopier() {
        Bean1 bean1 = new Bean1();
        Bean2 bean2 = new Bean2();
        BeanCopier<Bean1, Bean2> beanCopier = BeanCopiers.newCopier();
        beanCopier.copy(bean1);
        beanCopier.copy(bean1, bean2);
        beanCopier.copy(bean1, bean2, (BeanCopierResolver<Integer, String>) sourcePair ->
                new NameValuePair<String>().setName("str1").setValue(sourcePair.getValue() + ""));
        beanCopier.register((BeanCopierResolver<Integer, String>) sourcePair ->
                new NameValuePair<String>().setName("str1").setValue(sourcePair.getValue() + ""));
    }

}
