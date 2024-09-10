// Copyright 2021 Google LLC.
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

// This file contains custom annotations that are used by GAPIC generators to
// handle Long Running Operation methods (LRO) that are NOT compliant with
// https://google.aip.dev/151. These annotations are public for technical
// reasons only. Please DO NOT USE them in your protos.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.1
// 	protoc        (unknown)
// source: google/cloud/extended_operations.proto

package extendedops

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	descriptorpb "google.golang.org/protobuf/types/descriptorpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// An enum to be used to mark the essential (for polling) fields in an
// API-specific Operation object. A custom Operation object may contain many
// different fields, but only few of them are essential to conduct a successful
// polling process.
type OperationResponseMapping int32

const (
	// Do not use.
	OperationResponseMapping_UNDEFINED OperationResponseMapping = 0
	// A field in an API-specific (custom) Operation object which carries the same
	// meaning as google.longrunning.Operation.name.
	OperationResponseMapping_NAME OperationResponseMapping = 1
	// A field in an API-specific (custom) Operation object which carries the same
	// meaning as google.longrunning.Operation.done. If the annotated field is of
	// an enum type, `annotated_field_name == EnumType.DONE` semantics should be
	// equivalent to `Operation.done == true`. If the annotated field is of type
	// boolean, then it should follow the same semantics as Operation.done.
	// Otherwise, a non-empty value should be treated as `Operation.done == true`.
	OperationResponseMapping_STATUS OperationResponseMapping = 2
	// A field in an API-specific (custom) Operation object which carries the same
	// meaning as google.longrunning.Operation.error.code.
	OperationResponseMapping_ERROR_CODE OperationResponseMapping = 3
	// A field in an API-specific (custom) Operation object which carries the same
	// meaning as google.longrunning.Operation.error.message.
	OperationResponseMapping_ERROR_MESSAGE OperationResponseMapping = 4
)

// Enum value maps for OperationResponseMapping.
var (
	OperationResponseMapping_name = map[int32]string{
		0: "UNDEFINED",
		1: "NAME",
		2: "STATUS",
		3: "ERROR_CODE",
		4: "ERROR_MESSAGE",
	}
	OperationResponseMapping_value = map[string]int32{
		"UNDEFINED":     0,
		"NAME":          1,
		"STATUS":        2,
		"ERROR_CODE":    3,
		"ERROR_MESSAGE": 4,
	}
)

func (x OperationResponseMapping) Enum() *OperationResponseMapping {
	p := new(OperationResponseMapping)
	*p = x
	return p
}

func (x OperationResponseMapping) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (OperationResponseMapping) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_extended_operations_proto_enumTypes[0].Descriptor()
}

func (OperationResponseMapping) Type() protoreflect.EnumType {
	return &file_google_cloud_extended_operations_proto_enumTypes[0]
}

func (x OperationResponseMapping) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use OperationResponseMapping.Descriptor instead.
func (OperationResponseMapping) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_extended_operations_proto_rawDescGZIP(), []int{0}
}

var file_google_cloud_extended_operations_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptorpb.FieldOptions)(nil),
		ExtensionType: (*OperationResponseMapping)(nil),
		Field:         1149,
		Name:          "google.cloud.operation_field",
		Tag:           "varint,1149,opt,name=operation_field,enum=google.cloud.OperationResponseMapping",
		Filename:      "google/cloud/extended_operations.proto",
	},
	{
		ExtendedType:  (*descriptorpb.FieldOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         1150,
		Name:          "google.cloud.operation_request_field",
		Tag:           "bytes,1150,opt,name=operation_request_field",
		Filename:      "google/cloud/extended_operations.proto",
	},
	{
		ExtendedType:  (*descriptorpb.FieldOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         1151,
		Name:          "google.cloud.operation_response_field",
		Tag:           "bytes,1151,opt,name=operation_response_field",
		Filename:      "google/cloud/extended_operations.proto",
	},
	{
		ExtendedType:  (*descriptorpb.MethodOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         1249,
		Name:          "google.cloud.operation_service",
		Tag:           "bytes,1249,opt,name=operation_service",
		Filename:      "google/cloud/extended_operations.proto",
	},
	{
		ExtendedType:  (*descriptorpb.MethodOptions)(nil),
		ExtensionType: (*bool)(nil),
		Field:         1250,
		Name:          "google.cloud.operation_polling_method",
		Tag:           "varint,1250,opt,name=operation_polling_method",
		Filename:      "google/cloud/extended_operations.proto",
	},
}

// Extension fields to descriptorpb.FieldOptions.
var (
	// A field annotation that maps fields in an API-specific Operation object to
	// their standard counterparts in google.longrunning.Operation. See
	// OperationResponseMapping enum definition.
	//
	// optional google.cloud.OperationResponseMapping operation_field = 1149;
	E_OperationField = &file_google_cloud_extended_operations_proto_extTypes[0]
	// A field annotation that maps fields in the initial request message
	// (the one which started the LRO) to their counterparts in the polling
	// request message. For non-standard LRO, the polling response may be missing
	// some of the information needed to make a subsequent polling request. The
	// missing information (for example, project or region ID) is contained in the
	// fields of the initial request message that this annotation must be applied
	// to. The string value of the annotation corresponds to the name of the
	// counterpart field in the polling request message that the annotated field's
	// value will be copied to.
	//
	// optional string operation_request_field = 1150;
	E_OperationRequestField = &file_google_cloud_extended_operations_proto_extTypes[1]
	// A field annotation that maps fields in the polling request message to their
	// counterparts in the initial and/or polling response message. The initial
	// and the polling methods return an API-specific Operation object. Some of
	// the fields from that response object must be reused in the subsequent
	// request (like operation name/ID) to fully identify the polled operation.
	// This annotation must be applied to the fields in the polling request
	// message, the string value of the annotation must correspond to the name of
	// the counterpart field in the Operation response object whose value will be
	// copied to the annotated field.
	//
	// optional string operation_response_field = 1151;
	E_OperationResponseField = &file_google_cloud_extended_operations_proto_extTypes[2]
)

// Extension fields to descriptorpb.MethodOptions.
var (
	// A method annotation that maps an LRO method (the one which starts an LRO)
	// to the service, which will be used to poll for the operation status. The
	// annotation must be applied to the method which starts an LRO, the string
	// value of the annotation must correspond to the name of the service used to
	// poll for the operation status.
	//
	// optional string operation_service = 1249;
	E_OperationService = &file_google_cloud_extended_operations_proto_extTypes[3]
	// A method annotation that marks methods that can be used for polling
	// operation status (e.g. the MyPollingService.Get(MyPollingRequest) method).
	//
	// optional bool operation_polling_method = 1250;
	E_OperationPollingMethod = &file_google_cloud_extended_operations_proto_extTypes[4]
)

var File_google_cloud_extended_operations_proto protoreflect.FileDescriptor

var file_google_cloud_extended_operations_proto_rawDesc = []byte{
	0x0a, 0x26, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x65,
	0x78, 0x74, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x5f, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2a, 0x62, 0x0a, 0x18, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x4d, 0x61, 0x70,
	0x70, 0x69, 0x6e, 0x67, 0x12, 0x0d, 0x0a, 0x09, 0x55, 0x4e, 0x44, 0x45, 0x46, 0x49, 0x4e, 0x45,
	0x44, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x4e, 0x41, 0x4d, 0x45, 0x10, 0x01, 0x12, 0x0a, 0x0a,
	0x06, 0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x10, 0x02, 0x12, 0x0e, 0x0a, 0x0a, 0x45, 0x52, 0x52,
	0x4f, 0x52, 0x5f, 0x43, 0x4f, 0x44, 0x45, 0x10, 0x03, 0x12, 0x11, 0x0a, 0x0d, 0x45, 0x52, 0x52,
	0x4f, 0x52, 0x5f, 0x4d, 0x45, 0x53, 0x53, 0x41, 0x47, 0x45, 0x10, 0x04, 0x3a, 0x6f, 0x0a, 0x0f,
	0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x12,
	0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xfd,
	0x08, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x4d, 0x61, 0x70, 0x70, 0x69, 0x6e, 0x67, 0x52, 0x0e, 0x6f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x3a, 0x56, 0x0a,
	0x17, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x12, 0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64,
	0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xfe, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x15,
	0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x46, 0x69, 0x65, 0x6c, 0x64, 0x3a, 0x58, 0x0a, 0x18, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x66, 0x69, 0x65, 0x6c,
	0x64, 0x12, 0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x18, 0xff, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x16, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x3a,
	0x4c, 0x0a, 0x11, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x12, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x4f, 0x70, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x18, 0xe1, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x6f, 0x70, 0x65,
	0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x3a, 0x59, 0x0a,
	0x18, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x70, 0x6f, 0x6c, 0x6c, 0x69,
	0x6e, 0x67, 0x5f, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4d, 0x65, 0x74, 0x68,
	0x6f, 0x64, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xe2, 0x09, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x16, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x6f, 0x6c, 0x6c, 0x69,
	0x6e, 0x67, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x42, 0x79, 0x0a, 0x10, 0x63, 0x6f, 0x6d, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x42, 0x17, 0x45, 0x78,
	0x74, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x43, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x6f, 0x70, 0x73,
	0x3b, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x6f, 0x70, 0x73, 0xa2, 0x02, 0x04, 0x47,
	0x41, 0x50, 0x49, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_extended_operations_proto_rawDescOnce sync.Once
	file_google_cloud_extended_operations_proto_rawDescData = file_google_cloud_extended_operations_proto_rawDesc
)

func file_google_cloud_extended_operations_proto_rawDescGZIP() []byte {
	file_google_cloud_extended_operations_proto_rawDescOnce.Do(func() {
		file_google_cloud_extended_operations_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_extended_operations_proto_rawDescData)
	})
	return file_google_cloud_extended_operations_proto_rawDescData
}

var file_google_cloud_extended_operations_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_extended_operations_proto_goTypes = []interface{}{
	(OperationResponseMapping)(0),      // 0: google.cloud.OperationResponseMapping
	(*descriptorpb.FieldOptions)(nil),  // 1: google.protobuf.FieldOptions
	(*descriptorpb.MethodOptions)(nil), // 2: google.protobuf.MethodOptions
}
var file_google_cloud_extended_operations_proto_depIdxs = []int32{
	1, // 0: google.cloud.operation_field:extendee -> google.protobuf.FieldOptions
	1, // 1: google.cloud.operation_request_field:extendee -> google.protobuf.FieldOptions
	1, // 2: google.cloud.operation_response_field:extendee -> google.protobuf.FieldOptions
	2, // 3: google.cloud.operation_service:extendee -> google.protobuf.MethodOptions
	2, // 4: google.cloud.operation_polling_method:extendee -> google.protobuf.MethodOptions
	0, // 5: google.cloud.operation_field:type_name -> google.cloud.OperationResponseMapping
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	5, // [5:6] is the sub-list for extension type_name
	0, // [0:5] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_cloud_extended_operations_proto_init() }
func file_google_cloud_extended_operations_proto_init() {
	if File_google_cloud_extended_operations_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_extended_operations_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 5,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_extended_operations_proto_goTypes,
		DependencyIndexes: file_google_cloud_extended_operations_proto_depIdxs,
		EnumInfos:         file_google_cloud_extended_operations_proto_enumTypes,
		ExtensionInfos:    file_google_cloud_extended_operations_proto_extTypes,
	}.Build()
	File_google_cloud_extended_operations_proto = out.File
	file_google_cloud_extended_operations_proto_rawDesc = nil
	file_google_cloud_extended_operations_proto_goTypes = nil
	file_google_cloud_extended_operations_proto_depIdxs = nil
}
