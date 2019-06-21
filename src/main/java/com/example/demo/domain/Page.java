package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "page",
        "perPage",
        "totalPages",
        "total"
})
public class Page {
    @JsonProperty("country")
    private String country;
    @JsonProperty("page")
    private String page;
    @JsonProperty("perPage")
    private String perPage;
    @JsonProperty("totalPages")
    private String totalPages;
    @JsonProperty("total")
    private String total;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("page")
    public String getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(String page) {
        this.page = page;
    }

    @JsonProperty("perPage")
    public String getPerPage() {
        return perPage;
    }

    @JsonProperty("perPage")
    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("totalPages")
    public String getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }
}
