install:
	sudo apt update
	sudo apt install openjdk-17-jdk

	export JAVA_HOME=$(dirname $(dirname $(which java)))
	export PATH=$PATH:$JAVA_HOME/bin

	wget https://dlcdn.apache.org/zookeeper/zookeeper-3.8.4/apache-zookeeper-3.8.4-bin.tar.gz
	tar -zxvf apache-zookeeper-3.8.4-bin.tar.gz 
	sudo mkdir /usr/local/zookeeper
	sudo mv apache-zookeeper-3.8.4-bin/* /usr/local/zookeeper
	sudo cp /usr/local/zookeeper/conf/zoo_sample.cfg /usr/local/zookeeper/conf/zoo.cfg
	sudo -E bash /usr/local/zookeeper/bin/zkServer.sh start
	rm apache-zookeeper-3.8.4-bin.tar.gz

	
