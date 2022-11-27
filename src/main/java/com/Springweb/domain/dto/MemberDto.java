package com.Springweb.domain.dto;

import com.Springweb.domain.entity.member.MemberEntity;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @Builder
public class MemberDto {
    private int mno;
    private String memail;
    private String mpassword;
    private String mphone;
    // * dto ---> entity 변환
    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .mno(this.mno)
                .memail(this.memail)
                .mpassword(this.mpassword)
                .mphone(this.mphone)
                .build();
    }
}
