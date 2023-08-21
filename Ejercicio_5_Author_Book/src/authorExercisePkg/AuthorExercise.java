package authorExercisePkg;

public class AuthorExercise {
    public AuthorExercise(){
    }

    public static void main(String[] args) {
        Author authorOne = new Author();

        authorOne.setEmail("abcd@gmail.com");
        authorOne.setGender('m');
        authorOne.setName("Paulo");

        System.out.println(authorOne.toString());
    }
}
