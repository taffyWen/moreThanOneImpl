import com.demo.util.PersonTypeEnum;

public class Demo1 {

    public static void main(String[] args) {
        PersonTypeEnum[] values = PersonTypeEnum.values();
        for (PersonTypeEnum value : values) {
            System.out.println(value.name());
        }

    }
}
