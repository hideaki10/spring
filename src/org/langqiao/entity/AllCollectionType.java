package org.langqiao.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollectionType {

    public AllCollectionType() {

    }

    public AllCollectionType(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    private String[] array;
    private Set<String> set;
    private Map<String,String> map;
    private Properties props;


    @Override
    public String toString (){
        String strContent = "";
        for (String str:array){
            strContent += str + ",";
        }

        return this.list+","+this.set+","+this.map+","+this.props+","+strContent;
    }
}
