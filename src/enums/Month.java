package enums;

public enum Month {
    JANUARY("winter"), //- 31 days
    FEBRUARY("winter"), //- 28 days in a common year and 29 days in leap years
    MARCH("spring"), //- 31 days
    APRIL("spring"), //- 30 days
    MAY("spring"), //- 31 days
    JUNE("summer"), //- 30 days
    JULY("summer"), //- 31 days
    AUGUST("summer"), //- 31 days
    SEPTEMBER("fall"), //- 30 days
    OCTOBER("fall"), //- 31 days
    NOVEMBER("fall"), //- 30 days
    DECEMBER("winter"); //- 31 days


    Month(String mseason) {
        this.mseason = mseason;
    }


    public String mseason;
}


////2. Sozdat Enum kotorij soderjit mesjacy,
//// tak je kajdij mesjac soderjit informacijy
//// o wremeni goda ("winter", "spring", "summer", "fall");