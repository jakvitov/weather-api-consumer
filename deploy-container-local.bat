docker build --build-arg API_NINJAS_KEY=%API_NINJAS_KEY% -t wac:latest .
docker run -p 8080:8080 wac:latest