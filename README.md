#Microsoft Azure SDK for Java - the Intigua Fork

This is a fork of the official Azure/azure-sdk-for-java repository, with slight fixes and improvements added at Intigua.


# Improvements Made

1. The vmId property is available in returned VirtualMachine objects.


# Building from Code

Refer to Azure/azure-sdk-for-java project for developer environment setup.

Changes made in this fork are all in azure-mgmt-compute, which has been named intigua-azure-mgmt-compute.
This is the only project that should be compiled in this fork, and it depends directly on the latest version of the original Azure code.

To build the project, run mvn from within the library resource-management/azure-mgmt-compute.


# Contributing Code

If you would like to become an active contributor to this project please follow clean coding guidelines, and the regular github procedure:

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

