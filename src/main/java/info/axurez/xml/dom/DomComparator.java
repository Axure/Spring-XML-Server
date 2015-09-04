package info.axurez.xml.dom;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

/**
 * Created by zhenghu on 15 年 September. 5..
 */
public class DomComparator {
    public Boolean compare(Element firstDom, Element secondDom) {
        if (firstDom.getTagName() != secondDom.getTagName()) {
            return false;
        }
//        if (firstDom.getAttributeNode())
        NamedNodeMap firstNodeMap = firstDom.getAttributes();
        NamedNodeMap secondNodeMap = secondDom.getAttributes();


        return true;
    }
}
