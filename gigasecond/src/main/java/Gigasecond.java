import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {


    private LocalDate birthDate;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate bd) {
        birthDate = bd;
    }

    Gigasecond(LocalDateTime bdt) {
        birthDateTime = bdt;
    }

    LocalDateTime getDate() {
        Integer gigaSecond = 1000000000;

        if (birthDateTime == null) {
            return birthDate.atStartOfDay().plusSeconds(gigaSecond);
        } else {
            return birthDateTime.plusSeconds(gigaSecond);
        }
    }

}
