----- Docker -------
. To pull a Docker container:
  docker pull flytosky/ubuntussh
  or
  docker pull afein/workshop

. To run a Docker container:
  docker run -d -P --name test_sshd flytosky/ubuntussh
  or
  docker-compose up -d
  with docker-compose.yml
  workshop:
    ports:
        - "0.0.0.0:8022:22"
        - "0.0.0.0:8080:8880"
        - "0.0.0.0:8090:8890"
        - "0.0.0.0:1111:9000"
        - "0.0.0.0:1112:9002"
        - "0.0.0.0:1113:9003"
        - "0.0.0.0:1114:9033"
        - "0.0.0.0:1115:9034"
        - "0.0.0.0:1116:9038"
    image: afein/workshop

. To set port forwarding
  docker port test_sshd 22 0.0.0.0:32775

  9003/tcp -> 0.0.0.0:32780
  9033/tcp -> 0.0.0.0:32779
  9034/tcp -> 0.0.0.0:32778
  9037/tcp -> 0.0.0.0:32777
  9038/tcp -> 0.0.0.0:32776
  22/tcp -> 0.0.0.0:32783
  9000/tcp -> 0.0.0.0:32782
  9002/tcp -> 0.0.0.0:32781

. To stop and remove a container:
  docker stop $(docker ps -a -q)
  docker kill $(docker ps -a -q)
  docker rm $(docker ps -a -q)

. To push docker container to dockerhub:
  docker login
  on the docker hub,
  username: leipan
  email: leipan@jpl.nasa.gov
  docker commit -m 'comments' <Container ID> <Repository Name>
  docker push <Repository Name>
  docker commit -m 'update with git checkout' 7f9106629508 flytosky/ubuntussh

. To log on the running Docker as root:
  ssh root@cmacws4.jpl.nasa.gov -p 32783
  ssh svc@cmacws4.jpl.nasa.gov -p 32783

. To add users in the Docker container:
  useradd -gusers -Gusers -s/bin/bash -d/home/leipan -m leipan
  to add user to sudo group:
  usermod -aG sudo leipan

. To start the html server (the frontend), as user svc,
  cd JPL-WebService/ApacheCMDA-Frontend
  ./start.sh
   (./activator "run 8880")

  The HTML page location: ~/JPL-WebService/ApacheCMDA-Frontend/public/html/

(old)
. Start the Play! framework: sudo activator "run 9033", 9033 is the port number 
  The html pages will be started automatically.
  To start http server:
  cd /media/.../JPL/..
  activator "run 9032"

. To start the CMDA backend, as user svc,
  cd JPL-WebService/sevices/svc
  ./start.sh


----- gitHub -------
. To clone the git repository:
  git clone https://github.com/cmusv-sc/JPL-WebService.git

. git configuration so we can commit and push:
  git config --global user.email "leipan@jpl.nasa.gov"
  git config --global user.name "Lei Pan"
  password: (hint: same as oscar1)

