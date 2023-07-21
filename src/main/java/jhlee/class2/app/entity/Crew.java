package jhlee.class2.app.entity;

public class Crew {

    private String email;
    private String nickname;

    private Crew() {}

    private Crew(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "\"" + this.email + "\"";
    }

    public static CrewBuilder builder() {
        return new CrewBuilder();
    }

    public static class CrewBuilder {

        private String email;
        private String nickname;

        public CrewBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CrewBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Crew build() {
            return new Crew(this.email, this.nickname);
        }

    }

}
