
package com.check_currency.app.getRates;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AED",
    "AFN",
    "ALL",
    "AMD",
    "ANG",
    "AOA",
    "ARS",
    "AUD",
    "AWG",
    "AZN",
    "BAM",
    "BBD",
    "BDT",
    "BGN",
    "BHD",
    "BIF",
    "BMD",
    "BND",
    "BOB",
    "BRL",
    "BSD",
    "BTC",
    "BTN",
    "BWP",
    "BYN",
    "BZD",
    "CAD",
    "CDF",
    "CHF",
    "CLF",
    "CLP",
    "CNH",
    "CNY",
    "COP",
    "CRC",
    "CUC",
    "CUP",
    "CVE",
    "CZK",
    "DJF",
    "DKK",
    "DOP",
    "DZD",
    "EGP",
    "ERN",
    "ETB",
    "EUR",
    "FJD",
    "FKP",
    "GBP",
    "GEL",
    "GGP",
    "GHS",
    "GIP",
    "GMD",
    "GNF",
    "GTQ",
    "GYD",
    "HKD",
    "HNL",
    "HRK",
    "HTG",
    "HUF",
    "IDR",
    "ILS",
    "IMP",
    "INR",
    "IQD",
    "IRR",
    "ISK",
    "JEP",
    "JMD",
    "JOD",
    "JPY",
    "KES",
    "KGS",
    "KHR",
    "KMF",
    "KPW",
    "KRW",
    "KWD",
    "KYD",
    "KZT",
    "LAK",
    "LBP",
    "LKR",
    "LRD",
    "LSL",
    "LYD",
    "MAD",
    "MDL",
    "MGA",
    "MKD",
    "MMK",
    "MNT",
    "MOP",
    "MRO",
    "MRU",
    "MUR",
    "MVR",
    "MWK",
    "MXN",
    "MYR",
    "MZN",
    "NAD",
    "NGN",
    "NIO",
    "NOK",
    "NPR",
    "NZD",
    "OMR",
    "PAB",
    "PEN",
    "PGK",
    "PHP",
    "PKR",
    "PLN",
    "PYG",
    "QAR",
    "RON",
    "RSD",
    "RUB",
    "RWF",
    "SAR",
    "SBD",
    "SCR",
    "SDG",
    "SEK",
    "SGD",
    "SHP",
    "SLL",
    "SOS",
    "SRD",
    "SSP",
    "STD",
    "STN",
    "SVC",
    "SYP",
    "SZL",
    "THB",
    "TJS",
    "TMT",
    "TND",
    "TOP",
    "TRY",
    "TTD",
    "TWD",
    "TZS",
    "UAH",
    "UGX",
    "USD",
    "UYU",
    "UZS",
    "VES",
    "VND",
    "VUV",
    "WST",
    "XAF",
    "XAG",
    "XAU",
    "XCD",
    "XDR",
    "XOF",
    "XPD",
    "XPF",
    "XPT",
    "YER",
    "ZAR",
    "ZMW",
    "ZWL"
})
@Generated("jsonschema2pojo")
public class Rates {

    @JsonProperty("AED")
    public Double aed;
    @JsonProperty("AFN")
    public Double afn;
    @JsonProperty("ALL")
    public Double all;
    @JsonProperty("AMD")
    public Double amd;
    @JsonProperty("ANG")
    public Double ang;
    @JsonProperty("AOA")
    public Double aoa;
    @JsonProperty("ARS")
    public Double ars;
    @JsonProperty("AUD")
    public Double aud;
    @JsonProperty("AWG")
    public Double awg;
    @JsonProperty("AZN")
    public Double azn;
    @JsonProperty("BAM")
    public Double bam;
    @JsonProperty("BBD")
    public Double bbd;
    @JsonProperty("BDT")
    public Double bdt;
    @JsonProperty("BGN")
    public Double bgn;
    @JsonProperty("BHD")
    public Double bhd;
    @JsonProperty("BIF")
    public Double bif;
    @JsonProperty("BMD")
    public Double bmd;
    @JsonProperty("BND")
    public Double bnd;
    @JsonProperty("BOB")
    public Double bob;
    @JsonProperty("BRL")
    public Double brl;
    @JsonProperty("BSD")
    public Double bsd;
    @JsonProperty("BTC")
    public Double btc;
    @JsonProperty("BTN")
    public Double btn;
    @JsonProperty("BWP")
    public Double bwp;
    @JsonProperty("BYN")
    public Double byn;
    @JsonProperty("BZD")
    public Double bzd;
    @JsonProperty("CAD")
    public Double cad;
    @JsonProperty("CDF")
    public Double cdf;
    @JsonProperty("CHF")
    public Double chf;
    @JsonProperty("CLF")
    public Double clf;
    @JsonProperty("CLP")
    public Double clp;
    @JsonProperty("CNH")
    public Double cnh;
    @JsonProperty("CNY")
    public Double cny;
    @JsonProperty("COP")
    public Double cop;
    @JsonProperty("CRC")
    public Double crc;
    @JsonProperty("CUC")
    public Double cuc;
    @JsonProperty("CUP")
    public Double cup;
    @JsonProperty("CVE")
    public Double cve;
    @JsonProperty("CZK")
    public Double czk;
    @JsonProperty("DJF")
    public Double djf;
    @JsonProperty("DKK")
    public Double dkk;
    @JsonProperty("DOP")
    public Double dop;
    @JsonProperty("DZD")
    public Double dzd;
    @JsonProperty("EGP")
    public Double egp;
    @JsonProperty("ERN")
    public Double ern;
    @JsonProperty("ETB")
    public Double etb;
    @JsonProperty("EUR")
    public Double eur;
    @JsonProperty("FJD")
    public Double fjd;
    @JsonProperty("FKP")
    public Double fkp;
    @JsonProperty("GBP")
    public Double gbp;
    @JsonProperty("GEL")
    public Double gel;
    @JsonProperty("GGP")
    public Double ggp;
    @JsonProperty("GHS")
    public Double ghs;
    @JsonProperty("GIP")
    public Double gip;
    @JsonProperty("GMD")
    public Double gmd;
    @JsonProperty("GNF")
    public Double gnf;
    @JsonProperty("GTQ")
    public Double gtq;
    @JsonProperty("GYD")
    public Double gyd;
    @JsonProperty("HKD")
    public Double hkd;
    @JsonProperty("HNL")
    public Double hnl;
    @JsonProperty("HRK")
    public Double hrk;
    @JsonProperty("HTG")
    public Double htg;
    @JsonProperty("HUF")
    public Double huf;
    @JsonProperty("IDR")
    public Double idr;
    @JsonProperty("ILS")
    public Double ils;
    @JsonProperty("IMP")
    public Double imp;
    @JsonProperty("INR")
    public Double inr;
    @JsonProperty("IQD")
    public Double iqd;
    @JsonProperty("IRR")
    public Double irr;
    @JsonProperty("ISK")
    public Double isk;
    @JsonProperty("JEP")
    public Double jep;
    @JsonProperty("JMD")
    public Double jmd;
    @JsonProperty("JOD")
    public Double jod;
    @JsonProperty("JPY")
    public Double jpy;
    @JsonProperty("KES")
    public Double kes;
    @JsonProperty("KGS")
    public Double kgs;
    @JsonProperty("KHR")
    public Double khr;
    @JsonProperty("KMF")
    public Double kmf;
    @JsonProperty("KPW")
    public Double kpw;
    @JsonProperty("KRW")
    public Double krw;
    @JsonProperty("KWD")
    public Double kwd;
    @JsonProperty("KYD")
    public Double kyd;
    @JsonProperty("KZT")
    public Double kzt;
    @JsonProperty("LAK")
    public Double lak;
    @JsonProperty("LBP")
    public Double lbp;
    @JsonProperty("LKR")
    public Double lkr;
    @JsonProperty("LRD")
    public Double lrd;
    @JsonProperty("LSL")
    public Double lsl;
    @JsonProperty("LYD")
    public Double lyd;
    @JsonProperty("MAD")
    public Double mad;
    @JsonProperty("MDL")
    public Double mdl;
    @JsonProperty("MGA")
    public Double mga;
    @JsonProperty("MKD")
    public Double mkd;
    @JsonProperty("MMK")
    public Double mmk;
    @JsonProperty("MNT")
    public Double mnt;
    @JsonProperty("MOP")
    public Double mop;
    @JsonProperty("MRO")
    public Double mro;
    @JsonProperty("MRU")
    public Double mru;
    @JsonProperty("MUR")
    public Double mur;
    @JsonProperty("MVR")
    public Double mvr;
    @JsonProperty("MWK")
    public Double mwk;
    @JsonProperty("MXN")
    public Double mxn;
    @JsonProperty("MYR")
    public Double myr;
    @JsonProperty("MZN")
    public Double mzn;
    @JsonProperty("NAD")
    public Double nad;
    @JsonProperty("NGN")
    public Double ngn;
    @JsonProperty("NIO")
    public Double nio;
    @JsonProperty("NOK")
    public Double nok;
    @JsonProperty("NPR")
    public Double npr;
    @JsonProperty("NZD")
    public Double nzd;
    @JsonProperty("OMR")
    public Double omr;
    @JsonProperty("PAB")
    public Double pab;
    @JsonProperty("PEN")
    public Double pen;
    @JsonProperty("PGK")
    public Double pgk;
    @JsonProperty("PHP")
    public Double php;
    @JsonProperty("PKR")
    public Double pkr;
    @JsonProperty("PLN")
    public Double pln;
    @JsonProperty("PYG")
    public Double pyg;
    @JsonProperty("QAR")
    public Double qar;
    @JsonProperty("RON")
    public Double ron;
    @JsonProperty("RSD")
    public Double rsd;
    @JsonProperty("RUB")
    public Double rub;
    @JsonProperty("RWF")
    public Double rwf;
    @JsonProperty("SAR")
    public Double sar;
    @JsonProperty("SBD")
    public Double sbd;
    @JsonProperty("SCR")
    public Double scr;
    @JsonProperty("SDG")
    public Double sdg;
    @JsonProperty("SEK")
    public Double sek;
    @JsonProperty("SGD")
    public Double sgd;
    @JsonProperty("SHP")
    public Double shp;
    @JsonProperty("SLL")
    public Double sll;
    @JsonProperty("SOS")
    public Double sos;
    @JsonProperty("SRD")
    public Double srd;
    @JsonProperty("SSP")
    public Double ssp;
    @JsonProperty("STD")
    public Double std;
    @JsonProperty("STN")
    public Double stn;
    @JsonProperty("SVC")
    public Double svc;
    @JsonProperty("SYP")
    public Double syp;
    @JsonProperty("SZL")
    public Double szl;
    @JsonProperty("THB")
    public Double thb;
    @JsonProperty("TJS")
    public Double tjs;
    @JsonProperty("TMT")
    public Double tmt;
    @JsonProperty("TND")
    public Double tnd;
    @JsonProperty("TOP")
    public Double top;
    @JsonProperty("TRY")
    public Double _try;
    @JsonProperty("TTD")
    public Double ttd;
    @JsonProperty("TWD")
    public Double twd;
    @JsonProperty("TZS")
    public Double tzs;
    @JsonProperty("UAH")
    public Double uah;
    @JsonProperty("UGX")
    public Double ugx;
    @JsonProperty("USD")
    public Double usd;
    @JsonProperty("UYU")
    public Double uyu;
    @JsonProperty("UZS")
    public Double uzs;
    @JsonProperty("VES")
    public Double ves;
    @JsonProperty("VND")
    public Double vnd;
    @JsonProperty("VUV")
    public Double vuv;
    @JsonProperty("WST")
    public Double wst;
    @JsonProperty("XAF")
    public Double xaf;
    @JsonProperty("XAG")
    public Double xag;
    @JsonProperty("XAU")
    public Double xau;
    @JsonProperty("XCD")
    public Double xcd;
    @JsonProperty("XDR")
    public Double xdr;
    @JsonProperty("XOF")
    public Double xof;
    @JsonProperty("XPD")
    public Double xpd;
    @JsonProperty("XPF")
    public Double xpf;
    @JsonProperty("XPT")
    public Double xpt;
    @JsonProperty("YER")
    public Double yer;
    @JsonProperty("ZAR")
    public Double zar;
    @JsonProperty("ZMW")
    public Double zmw;
    @JsonProperty("ZWL")
    public Double zwl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
