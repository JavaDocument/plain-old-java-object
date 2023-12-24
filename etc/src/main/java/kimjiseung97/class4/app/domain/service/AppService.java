package kimjiseung97.class4.app.domain.service;

import kimjiseung97.class4.app.domain.config.AppConfig;
import kimjiseung97.class4.app.domain.repository.SNSRepository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppService implements SNSRepository {


    @Override
    public List<String> solution(final AppConfig appConfig) {
        Map<String, Integer> scores = new HashMap<>();

        for (String[] friend : appConfig.getFriends()) {
            if (friend[0].equals(appConfig.getUser())) {
                scores.put(friend[1], scores.getOrDefault(friend[1], 0) + 10);
            } else if (friend[1].equals(appConfig.getUser())) {
                scores.put(friend[0], scores.getOrDefault(friend[0], 0) + 10);
            }
        }

        // 이 코드가 변경되었습니다.
        for (String visitor : appConfig.getVisitors()) {
            if (scores.containsKey(visitor)) {
                scores.put(visitor, scores.getOrDefault(visitor, 0) + 1);
            } else if (!appConfig.getUser().equals(visitor)) {
                scores.put(visitor, scores.getOrDefault(visitor, 0) + 0);
            }
        }

        List<String> sortedFriends = scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getKey))
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return sortedFriends.subList(0, Math.min(sortedFriends.size(), 5));
    }
}
