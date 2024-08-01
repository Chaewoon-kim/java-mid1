package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;
    public UserV2(String id){
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj){
        UserV2 user = (UserV2) obj; //자식은 부모를 품을 수 없기 때문에 다운캐스팅 필요
        return id.equals(user.id);
        //id = this.id
        //나의 id와 인스턴스로 넘어오는 obj의 아이디가 같은지를 반환
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id,userV2.id);
    }
}
