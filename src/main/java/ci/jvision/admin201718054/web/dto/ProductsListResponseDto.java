package ci.jvision.admin201718054.web.dto;

import ci.jvision.admin201718054.domain.Products.Products;
import lombok.Getter;

@Getter
public class ProductsListResponseDto {

    private Long p_id;
    private String p_name;
    private Long p_price;
    private String p_desc;


    public ProductsListResponseDto(Products entity){
        this.p_id=getP_id();
        this.p_name=getP_name();
        this.p_price=getP_price();
        this.p_desc=getP_desc();
    }





}
