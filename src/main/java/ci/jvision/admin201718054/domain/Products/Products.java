package ci.jvision.admin201718054.domain.Products;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products { //테이블생성


    @Id//pk값
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동증강
    @Column(nullable=false)//널값 비허용
    private Long p_id;

    @Column(nullable=false)
    private String p_name;

    @Column(nullable=false)
    private Long p_price;

    @Column(length=500)//크기 500
    private String p_desc;

    @Builder //DB랑 연결
    public Products(String p_name, long p_price, String p_desc)
    {
        this.p_name=p_name;
        this.p_price=p_price;
        this.p_desc=p_desc;
    }

}
