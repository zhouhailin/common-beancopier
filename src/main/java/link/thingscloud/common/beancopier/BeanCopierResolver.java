package link.thingscloud.common.beancopier;

import link.thingscloud.common.beancopier.helper.NameValuePair;

/**
 * @author : zhouhailin
 */
@FunctionalInterface
public interface BeanCopierResolver<V1, V2> {

    NameValuePair<V2> resolver(NameValuePair<V1> sourcePair);

}
