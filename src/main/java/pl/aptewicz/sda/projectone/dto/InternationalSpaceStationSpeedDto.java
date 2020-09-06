package pl.aptewicz.sda.projectone.dto;


import java.util.List;

public class InternationalSpaceStationSpeedDto {

    private final  long timestamp;
    private  final List<iss_position> iss_positions;

    public InternationalSpaceStationSpeedDto(long timestamp, List<iss_position> iss_positions) {
        this.timestamp = timestamp;
        this.iss_positions = iss_positions;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public List<iss_position> getIss_positions() {
        return iss_positions;
    }

    @Override
    public String toString() {
        return "InternationalSpaceStationSpeedDto{" +
                "timestamp=" + timestamp +
                ", iss_positions=" + iss_positions +
                '}';
    }

    public class iss_position{

        private final  double longitude;
        private final  double latitude;

        public iss_position(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public double getLatitude() {
            return latitude;
        }


        @Override
        public String toString() {
            return "iss_position{" +
                    "longitude=" + longitude +
                    ", latitude=" + latitude +
                    '}';
        }
    }
}
