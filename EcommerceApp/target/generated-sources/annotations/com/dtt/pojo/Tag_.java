package com.dtt.pojo;

import com.dtt.pojo.ProdTag;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-24T10:59:53", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Tag.class)
public class Tag_ { 

    public static volatile SetAttribute<Tag, ProdTag> prodTagSet;
    public static volatile SingularAttribute<Tag, String> name;
    public static volatile SingularAttribute<Tag, Integer> id;
    public static volatile SingularAttribute<Tag, String> tagcol;

}