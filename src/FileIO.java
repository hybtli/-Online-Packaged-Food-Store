import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class FileIO {

    public static void readFile(IList<Order> order,IList<Tuna> tuna, IList<Corn> corn, IList<Pudding> pudding,
                                IList<Noodle> noodle) throws IOException, ParseException {

        String file = "src\\orders.csv";
        String line;

        SimpleDateFormat monthDate = new SimpleDateFormat("MMM-yy", Locale.ENGLISH);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM-yy");
        String actualDate = "Jun-22";
        Date date = monthDate.parse(actualDate);
        LocalDate expirationDateTuna, expirationDateCorn, expirationDatePudding, expirationDateNoodle;

        expirationDateTuna = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        expirationDateCorn = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        expirationDatePudding = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        expirationDateNoodle = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((line = br.readLine()) != null) {

            String[] splitLine = line.split(",");
            String[] foodCategory = new String[3];

            foodCategory[0] = splitLine[2];
            foodCategory[1] = splitLine[3];
            foodCategory[2] = splitLine[4];


            expirationDateTuna = expirationDateTuna.plusMonths(1);
            String monthNameTuna = expirationDateTuna.format(format);
            tuna.add(new Tuna(monthNameTuna));

            expirationDateCorn = expirationDateCorn.plusMonths(1);
            String monthNameCorn = expirationDateCorn.format(format);
            corn.add(new Corn(monthNameCorn));

            expirationDatePudding = expirationDatePudding.plusMonths(1);
            String monthNamePudding = expirationDatePudding.format(format);
            pudding.add(new Pudding(monthNamePudding));

            expirationDateNoodle = expirationDateNoodle.plusMonths(1);
            String monthNameNoodle = expirationDateNoodle.format(format);
            noodle.add(new Noodle(monthNameNoodle));

            order.add(new Order(Integer.parseInt(splitLine[0]), splitLine[1], foodCategory));

        }
        br.close();

    }

}

