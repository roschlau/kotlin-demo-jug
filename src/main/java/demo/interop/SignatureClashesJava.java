package demo.interop;

import java.util.ArrayList;
import java.util.List;

public class SignatureClashesJava {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List<String> filtered = SignatureClashes.filterValid(list);

    }

}
