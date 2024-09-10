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
// source: google/api/logging.proto

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

// Logging configuration of the service.
//
// The following example shows how to configure logs to be sent to the
// producer and consumer projects. In the example, the `activity_history`
// log is sent to both the producer and consumer projects, whereas the
// `purchase_history` log is only sent to the producer project.
//
//	monitored_resources:
//	- type: library.googleapis.com/branch
//	  labels:
//	  - key: /city
//	    description: The city where the library branch is located in.
//	  - key: /name
//	    description: The name of the branch.
//	logs:
//	- name: activity_history
//	  labels:
//	  - key: /customer_id
//	- name: purchase_history
//	logging:
//	  producer_destinations:
//	  - monitored_resource: library.googleapis.com/branch
//	    logs:
//	    - activity_history
//	    - purchase_history
//	  consumer_destinations:
//	  - monitored_resource: library.googleapis.com/branch
//	    logs:
//	    - activity_history
type Logging struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Logging configurations for sending logs to the producer project.
	// There can be multiple producer destinations, each one must have a
	// different monitored resource type. A log can be used in at most
	// one producer destination.
	ProducerDestinations []*Logging_LoggingDestination `protobuf:"bytes,1,rep,name=producer_destinations,json=producerDestinations,proto3" json:"producer_destinations,omitempty"`
	// Logging configurations for sending logs to the consumer project.
	// There can be multiple consumer destinations, each one must have a
	// different monitored resource type. A log can be used in at most
	// one consumer destination.
	ConsumerDestinations []*Logging_LoggingDestination `protobuf:"bytes,2,rep,name=consumer_destinations,json=consumerDestinations,proto3" json:"consumer_destinations,omitempty"`
}

func (x *Logging) Reset() {
	*x = Logging{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_logging_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Logging) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Logging) ProtoMessage() {}

func (x *Logging) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_logging_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Logging.ProtoReflect.Descriptor instead.
func (*Logging) Descriptor() ([]byte, []int) {
	return file_google_api_logging_proto_rawDescGZIP(), []int{0}
}

func (x *Logging) GetProducerDestinations() []*Logging_LoggingDestination {
	if x != nil {
		return x.ProducerDestinations
	}
	return nil
}

func (x *Logging) GetConsumerDestinations() []*Logging_LoggingDestination {
	if x != nil {
		return x.ConsumerDestinations
	}
	return nil
}

// Configuration of a specific logging destination (the producer project
// or the consumer project).
type Logging_LoggingDestination struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The monitored resource type. The type must be defined in the
	// [Service.monitored_resources][google.api.Service.monitored_resources] section.
	MonitoredResource string `protobuf:"bytes,3,opt,name=monitored_resource,json=monitoredResource,proto3" json:"monitored_resource,omitempty"`
	// Names of the logs to be sent to this destination. Each name must
	// be defined in the [Service.logs][google.api.Service.logs] section. If the log name is
	// not a domain scoped name, it will be automatically prefixed with
	// the service name followed by "/".
	Logs []string `protobuf:"bytes,1,rep,name=logs,proto3" json:"logs,omitempty"`
}

func (x *Logging_LoggingDestination) Reset() {
	*x = Logging_LoggingDestination{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_logging_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Logging_LoggingDestination) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Logging_LoggingDestination) ProtoMessage() {}

func (x *Logging_LoggingDestination) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_logging_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Logging_LoggingDestination.ProtoReflect.Descriptor instead.
func (*Logging_LoggingDestination) Descriptor() ([]byte, []int) {
	return file_google_api_logging_proto_rawDescGZIP(), []int{0, 0}
}

func (x *Logging_LoggingDestination) GetMonitoredResource() string {
	if x != nil {
		return x.MonitoredResource
	}
	return ""
}

func (x *Logging_LoggingDestination) GetLogs() []string {
	if x != nil {
		return x.Logs
	}
	return nil
}

var File_google_api_logging_proto protoreflect.FileDescriptor

var file_google_api_logging_proto_rawDesc = []byte{
	0x0a, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9c, 0x02, 0x0a, 0x07, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x12, 0x5b, 0x0a, 0x15, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x65, 0x72, 0x5f, 0x64, 0x65, 0x73,
	0x74, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x4c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x44, 0x65, 0x73, 0x74,
	0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x14, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x65,
	0x72, 0x44, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x5b, 0x0a,
	0x15, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x5f, 0x64, 0x65, 0x73, 0x74, 0x69, 0x6e,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e,
	0x67, 0x2e, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x44, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x52, 0x14, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x44, 0x65,
	0x73, 0x74, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x1a, 0x57, 0x0a, 0x12, 0x4c, 0x6f,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x44, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x2d, 0x0a, 0x12, 0x6d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x65, 0x64, 0x5f, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x11, 0x6d, 0x6f,
	0x6e, 0x69, 0x74, 0x6f, 0x72, 0x65, 0x64, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12,
	0x12, 0x0a, 0x04, 0x6c, 0x6f, 0x67, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x04, 0x6c,
	0x6f, 0x67, 0x73, 0x42, 0x6e, 0x0a, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x70, 0x69, 0x42, 0x0c, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f,
	0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3b, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0xa2, 0x02, 0x04, 0x47,
	0x41, 0x50, 0x49, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_api_logging_proto_rawDescOnce sync.Once
	file_google_api_logging_proto_rawDescData = file_google_api_logging_proto_rawDesc
)

func file_google_api_logging_proto_rawDescGZIP() []byte {
	file_google_api_logging_proto_rawDescOnce.Do(func() {
		file_google_api_logging_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_logging_proto_rawDescData)
	})
	return file_google_api_logging_proto_rawDescData
}

var file_google_api_logging_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_api_logging_proto_goTypes = []interface{}{
	(*Logging)(nil),                    // 0: google.api.Logging
	(*Logging_LoggingDestination)(nil), // 1: google.api.Logging.LoggingDestination
}
var file_google_api_logging_proto_depIdxs = []int32{
	1, // 0: google.api.Logging.producer_destinations:type_name -> google.api.Logging.LoggingDestination
	1, // 1: google.api.Logging.consumer_destinations:type_name -> google.api.Logging.LoggingDestination
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_api_logging_proto_init() }
func file_google_api_logging_proto_init() {
	if File_google_api_logging_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_logging_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Logging); i {
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
		file_google_api_logging_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Logging_LoggingDestination); i {
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
			RawDescriptor: file_google_api_logging_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_logging_proto_goTypes,
		DependencyIndexes: file_google_api_logging_proto_depIdxs,
		MessageInfos:      file_google_api_logging_proto_msgTypes,
	}.Build()
	File_google_api_logging_proto = out.File
	file_google_api_logging_proto_rawDesc = nil
	file_google_api_logging_proto_goTypes = nil
	file_google_api_logging_proto_depIdxs = nil
}
