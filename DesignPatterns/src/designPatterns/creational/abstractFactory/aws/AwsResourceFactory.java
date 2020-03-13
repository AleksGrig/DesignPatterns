package designPatterns.creational.abstractFactory.aws;

import designPatterns.creational.abstractFactory.Instance;
import designPatterns.creational.abstractFactory.Instance.Capacity;
import designPatterns.creational.abstractFactory.ResourceFactory;
import designPatterns.creational.abstractFactory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
