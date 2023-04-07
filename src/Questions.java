import java.util.LinkedList;

public class Questions {
    protected static LinkedList<String> questions = new LinkedList<>();
    protected static LinkedList<String[]> answers = new LinkedList<>();
    protected static LinkedList<String> correct = new LinkedList<>();
    protected static LinkedList<String> usedQuestions = new LinkedList<>();
    public Questions(){
        // 1
        questions.add("What is the capital of Germany?");
        answers.add(new String[]{"Cologne", "Berlin", "Munich", "Bonn"});
        correct.add("Berlin");
        // 2
        questions.add("What is the smallest state in terms of area called?");
        answers.add(new String[]{"Berlin", "Bremen", "Saarland", "Hamburg"});
        correct.add("Bremen");
        // 3
        questions.add("What does \"carpe diem\" mean?");
        answers.add(new String[]{"Enjoy life", "Seize the day", "Your day will be great",
                "<html><body>You always see each<br> other twice in life</body></html>"});
        correct.add("Seize the day");
        // 4
        questions.add("Which metal conducts heat best?");
        answers.add(new String[]{"Silver", "Copper", "Gold", "Aluminum"});
        correct.add("Silver");
        // 5
        questions.add("How many federal states does Germany have?");
        answers.add(new String[]{"13", "9", "20", "16"});
        correct.add("16");
        // 6
        questions.add("What is Caesar supposed to have said when he crossed the Rubicon?");
        answers.add(new String[]{"veni, vidi, vici", "divide et empera", "alea iacta est", "et tu, brute"});
        correct.add("alea iacta est");
        // 7
        questions.add("How many Oscars did the movie \"Titanic\" win?");
        answers.add(new String[]{"10", "11", "12", "13"});
        correct.add("11");
        // 8
        questions.add("What is the chemical symbol for lead?");
        answers.add(new String[]{"Bl", "Pb", "Be", "Pt"});
        correct.add("Pb");
        // 9
        questions.add("How many planets does our solar system have?");
        answers.add(new String[]{"8", "9", "10", "11"});
        correct.add("8");
        // 10
        questions.add("In which sea is the island of Hawaii located?");
        answers.add(new String[]{"Atlantic Ocean", "Indian Ocean", "Caribbean Sea", "Pacific Ocean"});
        correct.add("Pacific Ocean");
        // 11
        questions.add("On which date did the Berlin Wall fall?");
        answers.add(new String[]{"3. October 1990", "2. November 1990", "9. November 1989", "8. October 1989"});
        correct.add("9. November 1989");
        // 12
        questions.add("Who wrote the Harry Potter books?");
        answers.add(new String[]{"E.L. James", "J.R.R. Tolkien", "George R.R. Martin", "Joanne K. Rowling"});
        correct.add("Joanne K. Rowling");
        // 13
        questions.add("How long is the Great Wall of China (rounded)?");
        answers.add(new String[]{"12.000km", "15.000km", "18.000km", "21.000km"});
        correct.add("21.000km");
        // 14
        questions.add("How many keys does a piano have?");
        answers.add(new String[]{"88", "70", "65", "80"});
        correct.add("88");
        // 15
        questions.add("What is the capital of Portugal?");
        answers.add(new String[]{"Porto", "Lisbon", "Lago", "Tavira"});
        correct.add("Lisbon");
        // 16
        questions.add("What is the chemical symbol for silver?");
        answers.add(new String[]{"An", "Ab", "Ag", "Af"});
        correct.add("Ag");
        // 17
        questions.add("How many hearts does an octopus have?");
        answers.add(new String[]{"2", "3", "1", "None"});
        correct.add("3");
        // 18
        questions.add("How many bones does an adult body have?");
        answers.add(new String[]{"250", "170", "206", "215"});
        correct.add("206");
        // 19
        questions.add("How many liters of beer are drunk per capita per year in Germany?");
        answers.add(new String[]{"150l", "170l", "100l", "75l"});
        correct.add("100l");
        // 20
        questions.add("How long did Goethe work on his \"Faust\"?");
        answers.add(new String[]{"20 Years", "64 Years", "34 Years", "10 Years"});
        correct.add("64 Years");
    }
}
