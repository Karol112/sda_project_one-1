package pl.aptewicz.sda.projectone.service.formatter;

import com.google.gson.Gson;
import pl.aptewicz.sda.projectone.dto.InternationalSpaceStationSpeedDto;
import pl.aptewicz.sda.projectone.dto.PeopleInSpaceDto;

import java.net.http.HttpResponse;
import java.util.stream.Collectors;

public class JsonResponseFormatterSpeed implements ResponseFormatter {

    private static final Gson gson = new Gson();

    @Override
    public String formatResponse(HttpResponse<String> response) {
        final var json = response.body();
        final var IsisSpeed = gson.fromJson(json, InternationalSpaceStationSpeedDto.class);
        //  {"iss_position": {"longitude": "-120.4943", "latitude": "-31.8826"}, "timestamp": 1599334583, "message": "success"}

        //return String.format("iss_position: %s  timestamp %d",
               // IsisSpeed.getIss_positions().stream().map(iss_position -> iss_position.getLongitude() +"sdd"+ iss_position.getLatitude() + "\n").collect(Collectors.joining()),IsisSpeed.getTimestamp());

        return IsisSpeed.toString();

    }
}


/*
return String.format("Currently there are %d people in space:\n%s", peopleInSpace.getNumber(),
        peopleInSpace.getPeople().stream()
        .map(humanInSpace -> humanInSpace.getName() + " on craft " + humanInSpace.getCraft() + "\n")
        .collect(Collectors.joining()));*/
