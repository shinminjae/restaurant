package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchImageReq {

    private String query = "";

    private int display = 1;

    private int start = 1;

    private String sort = "sim";

    private String filter = "all";

    public MultiValueMap<String,String> toMultiValueMap(){
        var map = new LinkedMultiValueMap<String,String>();

        map.add("query",this.query);
        map.add("display",String.valueOf(this.display));
        map.add("start",String.valueOf(this.start));
        map.add("sort",this.sort);
        map.add("filter",this.filter);
        return map;

    }

}
