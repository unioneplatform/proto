[![main](https://github.com/unioneplatform/proto/actions/workflows/main.yml/badge.svg)](https://github.com/unioneplatform/proto/actions/workflows/main.yml)

`proto` is the [protobuf](https://developers.google.com/protocol-buffers) definition of the Uni-One Platform API.

The folder `google/*` was cloned from [github.com/googleapis/api-common-protos](https://github.com/googleapis/api-common-protos). The folder `protoc-gen-openapiv2/*` was cloned from [github.com/grpc-ecosystem/grpc-gateway/protoc-gen-openapiv2](https://github.com/grpc-ecosystem/grpc-gateway/tree/master/protoc-gen-openapiv2).

You need to install the following tools to build locally:

* The [protoc](https://grpc.io/docs/protoc-installation/) compiler
* The following compiler plugins:

```bash
$ go install google.golang.org/protobuf/cmd/protoc-gen-go@latest
$ go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest
$ go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway@latest
$ go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2@latest
$ go install github.com/pseudomuto/protoc-gen-doc/cmd/protoc-gen-doc@latest
```

* The [buf](https://docs.buf.build/installation) tool

Then run:

```bash
$ ./build.sh
```

Generated SDKs from updates to this repository:

* [go-sdk](https://github.com/unioneplatform/go-sdk)

The OpenAPI documentation files are generated in this [repo](https://github.com/unioneplatform/api-docs).
