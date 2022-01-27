package com.example.country;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Data
@Builder
@Setter
@ToString
@Document("Countries")
public class Country extends Object {
    @Id
    int id ;
    @Indexed(unique = true)
    private String name_ar ;
    @Indexed(unique = true)

    private String name_en ;
    @Indexed(unique = false)
    private String capital_ar ;
    @Indexed(unique = true)

    private  String capital_en ;

    @Indexed(unique = true)

    private  String phonecode;
    @Indexed(unique = true)


    private String currancy_ar;
    @Indexed(unique = true)

    private  String currency_en;
    @Indexed(unique = false)

    private  String longtiude ;
    @Indexed(unique = false)

    private  String latitude ;
    @Indexed(unique = false)

    private  String description_ar;
    @Indexed(unique = false)

    private   String description_en;


    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name_ar
     */
    public String getName_ar() {
        return this.name_ar;
    }

    /**
     * set field
     *
     * @param name_ar
     */
    public void setName_ar(String name_ar) {
        this.name_ar = name_ar;
    }

    /**
     * get field
     *
     * @return name_en
     */

    public String getName_en() {
        return this.name_en;
    }

    /**
     * set field
     *
     * @param name_en
     */
    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    /**
     * get field
     *
     * @return capital_ar
     */
    public String getCapital_ar() {
        return this.capital_ar;
    }

    /**
     * set field
     *
     * @param capital_ar
     */
    public void setCapital_ar(String capital_ar) {
        this.capital_ar = capital_ar;
    }

    /**
     * get field
     *
     * @return CapitalEn
     */
    public String getCapitalEn() {
        return this.capital_en;
    }

    /**
     * set field
     *
     * @param capital_en
     */
    public void setCapitalEn(String capital_en) {
        this.capital_en = capital_en;
    }

    /**
     * get field
     *
     * @return PhoneCode
     */
    public String getPhoneCode() {
        return this.phonecode;
    }

    /**
     * set field
     *
     * @param phonecode
     */
    public void setPhoneCode(String phonecode) {
        this.phonecode = phonecode;
    }

    /**
     * get field
     *
     * @return CurrancyAr
     */
    public String getCurrancyAr() {
        return this.currancy_ar;
    }

    /**
     * set field
     *
     * @param currancy_ar
     */
    public void setCurrancyAr(String currancy_ar) {
        this.currancy_ar = currancy_ar;
    }

    /**
     * get field
     *
     * @return CurrencyEn
     */
    public String getCurrencyEn() {

        return this.currency_en;
                                  }

    /**
     * set field
     *
     * @param currency_en
     */
    public void setCurrencyEn(String currency_en) {
        this.currency_en = currency_en;
    }

    /**
     * get field
     *
     * @return longtiude
     */
    public String getLongtiude() {
        return this.longtiude;
    }

    /**
     * set field
     *
     * @param longtiude
     */
    public void setLongtiude(String longtiude) {
        this.longtiude = longtiude;
    }

    /**
     * get field
     *
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * set field
     *
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * get field
     *
     * @return description_ar
     */
    public String getDiscription_Ar() {
        return this.description_ar;
    }

    /**
     * set field
     *
     * @param description_ar
     */
    public void setDiscription_Ar(String description_ar) {
        this.description_ar = description_ar;
    }

    /**
     * get field
     *
     * @return description_en
     */
    public String getDiscription_En() {
        return this.description_en;
    }

    /**
     * set field
     *
     * @param description_en
     */
    public void setDiscription_En(String description_en) {
        this.description_en = description_en;
    }
}
