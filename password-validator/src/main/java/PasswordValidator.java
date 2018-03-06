public class PasswordValidator {
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return hasMoreThanEightCharacters() &&
            containsAtLeastOneCapitalLetter() &&
            containsAtLeastOneLowerLetter() &&
            containsAtLeastOneNumber() &&
            containsUnderScore();
    }

    private boolean containsUnderScore() {
        return this.password.contains("_");
    }

    private boolean containsAtLeastOneNumber() {
        return this.password.matches(".*\\d+.*");
    }

    private boolean containsAtLeastOneLowerLetter() {
        return this.password.matches(".*[a-z]+.*");
    }

    private boolean containsAtLeastOneCapitalLetter() {
        return this.password.matches(".*[A-Z]+.*");
    }

    private boolean hasMoreThanEightCharacters() {
        return this.password.length() > 8;
    }
}
