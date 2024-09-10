// Copyright 2018 Google LLC.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.1
// 	protoc        (unknown)
// source: google/api/endpoint.proto

package serviceconfig

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// `Endpoint` describes a network endpoint that serves a set of APIs.
// A service may expose any number of endpoints, and all endpoints share the
// same service configuration, such as quota configuration and monitoring
// configuration.
//
// Example service configuration:
//
//	name: library-example.googleapis.com
//	endpoints:
//	  # Below entry makes 'google.example.library.v1.Library'
//	  # API be served from endpoint address library-example.googleapis.com.
//	  # It also allows HTTP OPTIONS calls to be passed to the backend, for
//	  # it to decide whether the subsequent cross-origin request is
//	  # allowed to proceed.
//	- name: library-example.googleapis.com
//	  allow_cors: true
type Endpoint struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The canonical name of this endpoint.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// DEPRECATED: This field is no longer supported. Instead of using aliases,
	// please specify multiple [google.api.Endpoint][google.api.Endpoint] for each of the intended
	// aliases.
	//
	// Additional names that this endpoint will be hosted on.
	Aliases []string `protobuf:"bytes,2,rep,name=aliases,proto3" json:"aliases,omitempty"`
	// The list of features enabled on this endpoint.
	Features []string `protobuf:"bytes,4,rep,name=features,proto3" json:"features,omitempty"`
	// The specification of an Internet routable address of API frontend that will
	// handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary).
	// It should be either a valid IPv4 address or a fully-qualified domain name.
	// For example, "8.8.8.8" or "myservice.appspot.com".
	Target string `protobuf:"bytes,101,opt,name=target,proto3" json:"target,omitempty"`
	// Allowing
	// [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
	// cross-domain traffic, would allow the backends served from this endpoint to
	// receive and respond to HTTP OPTIONS requests. The response will be used by
	// the browser to determine whether the subsequent cross-origin request is
	// allowed to proceed.
	AllowCors bool `protobuf:"varint,5,opt,name=allow_cors,json=allowCors,proto3" json:"allow_cors,omitempty"`
}

func (x *Endpoint) Reset() {
	*x = Endpoint{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_endpoint_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Endpoint) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Endpoint) ProtoMessage() {}

func (x *Endpoint) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_endpoint_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Endpoint.ProtoReflect.Descriptor instead.
func (*Endpoint) Descriptor() ([]byte, []int) {
	return file_google_api_endpoint_proto_rawDescGZIP(), []int{0}
}

func (x *Endpoint) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Endpoint) GetAliases() []string {
	if x != nil {
		return x.Aliases
	}
	return nil
}

func (x *Endpoint) GetFeatures() []string {
	if x != nil {
		return x.Features
	}
	return nil
}

func (x *Endpoint) GetTarget() string {
	if x != nil {
		return x.Target
	}
	return ""
}

func (x *Endpoint) GetAllowCors() bool {
	if x != nil {
		return x.AllowCors
	}
	return false
}

var File_google_api_endpoint_proto protoreflect.FileDescriptor

var file_google_api_endpoint_proto_rawDesc = []byte{
	0x0a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x65, 0x6e, 0x64,
	0x70, 0x6f, 0x69, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8b, 0x01, 0x0a, 0x08, 0x45, 0x6e, 0x64, 0x70, 0x6f, 0x69,
	0x6e, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x61, 0x6c, 0x69, 0x61, 0x73, 0x65,
	0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x52, 0x07, 0x61, 0x6c, 0x69, 0x61, 0x73, 0x65, 0x73,
	0x12, 0x1a, 0x0a, 0x08, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x73, 0x18, 0x04, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x08, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x73, 0x12, 0x16, 0x0a, 0x06,
	0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x18, 0x65, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x74, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x12, 0x1d, 0x0a, 0x0a, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x63, 0x6f,
	0x72, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x43,
	0x6f, 0x72, 0x73, 0x42, 0x6f, 0x0a, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x70, 0x69, 0x42, 0x0d, 0x45, 0x6e, 0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3b,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0xa2, 0x02, 0x04,
	0x47, 0x41, 0x50, 0x49, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_api_endpoint_proto_rawDescOnce sync.Once
	file_google_api_endpoint_proto_rawDescData = file_google_api_endpoint_proto_rawDesc
)

func file_google_api_endpoint_proto_rawDescGZIP() []byte {
	file_google_api_endpoint_proto_rawDescOnce.Do(func() {
		file_google_api_endpoint_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_endpoint_proto_rawDescData)
	})
	return file_google_api_endpoint_proto_rawDescData
}

var file_google_api_endpoint_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_api_endpoint_proto_goTypes = []interface{}{
	(*Endpoint)(nil), // 0: google.api.Endpoint
}
var file_google_api_endpoint_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_api_endpoint_proto_init() }
func file_google_api_endpoint_proto_init() {
	if File_google_api_endpoint_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_endpoint_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Endpoint); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_api_endpoint_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_endpoint_proto_goTypes,
		DependencyIndexes: file_google_api_endpoint_proto_depIdxs,
		MessageInfos:      file_google_api_endpoint_proto_msgTypes,
	}.Build()
	File_google_api_endpoint_proto = out.File
	file_google_api_endpoint_proto_rawDesc = nil
	file_google_api_endpoint_proto_goTypes = nil
	file_google_api_endpoint_proto_depIdxs = nil
}
