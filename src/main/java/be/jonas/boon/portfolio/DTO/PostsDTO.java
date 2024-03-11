package be.jonas.boon.portfolio.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder(setterPrefix = "with")
@Getter
@Setter
public class PostsDTO {

    private String title;

    public class Mapper {
        public static PostsDTO mapTo(String title){
            return PostsDTO.builder()
                    .withTitle(title)
                    .build();
        }
    }
}
