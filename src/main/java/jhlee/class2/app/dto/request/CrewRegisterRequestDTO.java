package jhlee.class2.app.dto.request;

public class CrewRegisterRequestDTO {

    private String email;
    private String nickname;

    private CrewRegisterRequestDTO(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    public static CrewRegisterRequestDTOBuilder builder() {
        return new CrewRegisterRequestDTOBuilder();
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public static class CrewRegisterRequestDTOBuilder {

        private String email;
        private String nickname;

        public CrewRegisterRequestDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CrewRegisterRequestDTOBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public CrewRegisterRequestDTO build() {
            return new CrewRegisterRequestDTO(this.email, this.nickname);
        }
    }

}
