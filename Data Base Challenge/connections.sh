!/bin/bash

pgbench -i -s 30 -h 172.17.228.179 -d challenge --username=postgres -q

pgbench -c 200 -j 4 -T 600 -h 172.17.228.179 -d challenge --username=postgres