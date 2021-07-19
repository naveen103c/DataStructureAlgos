package Miscellenous;
import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String[] args) {
        Set<String> st=new HashSet<String>();
        st.add("Geeks");
        st.add("for");
        st.add("geeks");
        st.add("for");
        st.add("programmers");
        System.out.println(st);
    }
    
}
