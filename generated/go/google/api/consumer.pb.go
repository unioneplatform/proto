// Copyright 2016 Google Inc.
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
// source: google/api/consumer.proto

package serviceconfig

import (
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

// Supported data type of the property values
type Property_PropertyType int32

const (
	// The type is unspecified, and will result in an error.
	Property_UNSPECIFIED Property_PropertyType = 0
	// The type is `int64`.
	Property_INT64 Property_PropertyType = 1
	// The type is `bool`.
	Property_BOOL Property_PropertyType = 2
	// The type is `string`.
	Property_STRING Property_PropertyType = 3
	// The type is 'double'.
	Property_DOUBLE Property_PropertyType = 4
)

// Enum value maps for Property_PropertyType.
var (
	Property_PropertyType_name = map[int32]string{
		0: "UNSPECIFIED",
		1: "INT64",
		2: "BOOL",
		3: "STRING",
		4: "DOUBLE",
	}
	Property_PropertyType_value = map[string]int32{
		"UNSPECIFIED": 0,
		"INT64":       1,
		"BOOL":        2,
		"STRING":      3,
		"DOUBLE":      4,
	}
)

func (x Property_PropertyType) Enum() *Property_PropertyType {
	p := new(Property_PropertyType)
	*p = x
	return p
}

func (x Property_PropertyType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Property_PropertyType) Descriptor() protoreflect.EnumDescriptor {
	return file_google_api_consumer_proto_enumTypes[0].Descriptor()
}

func (Property_PropertyType) Type() protoreflect.EnumType {
	return &file_google_api_consumer_proto_enumTypes[0]
}

func (x Property_PropertyType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Property_PropertyType.Descriptor instead.
func (Property_PropertyType) EnumDescriptor() ([]byte, []int) {
	return file_google_api_consumer_proto_rawDescGZIP(), []int{1, 0}
}

// A descriptor for defining project properties for a service. One service may
// have many consumer projects, and the service may want to behave differently
// depending on some properties on the project. For example, a project may be
// associated with a school, or a business, or a government agency, a business
// type property on the project may affect how a service responds to the client.
// This descriptor defines which properties are allowed to be set on a project.
//
// Example:
//
//	project_properties:
//	  properties:
//	  - name: NO_WATERMARK
//	    type: BOOL
//	    description: Allows usage of the API without watermarks.
//	  - name: EXTENDED_TILE_CACHE_PERIOD
//	    type: INT64
type ProjectProperties struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// List of per consumer project-specific properties.
	Properties []*Property `protobuf:"bytes,1,rep,name=properties,proto3" json:"properties,omitempty"`
}

func (x *ProjectProperties) Reset() {
	*x = ProjectProperties{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_consumer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ProjectProperties) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ProjectProperties) ProtoMessage() {}

func (x *ProjectProperties) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_consumer_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ProjectProperties.ProtoReflect.Descriptor instead.
func (*ProjectProperties) Descriptor() ([]byte, []int) {
	return file_google_api_consumer_proto_rawDescGZIP(), []int{0}
}

func (x *ProjectProperties) GetProperties() []*Property {
	if x != nil {
		return x.Properties
	}
	return nil
}

// Defines project properties.
//
// API services can define properties that can be assigned to consumer projects
// so that backends can perform response customization without having to make
// additional calls or maintain additional storage. For example, Maps API
// defines properties that controls map tile cache period, or whether to embed a
// watermark in a result.
//
// These values can be set via API producer console. Only API providers can
// define and set these properties.
type Property struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The name of the property (a.k.a key).
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// The type of this property.
	Type Property_PropertyType `protobuf:"varint,2,opt,name=type,proto3,enum=google.api.Property_PropertyType" json:"type,omitempty"`
	// The description of the property
	Description string `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
}

func (x *Property) Reset() {
	*x = Property{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_consumer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Property) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Property) ProtoMessage() {}

func (x *Property) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_consumer_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Property.ProtoReflect.Descriptor instead.
func (*Property) Descriptor() ([]byte, []int) {
	return file_google_api_consumer_proto_rawDescGZIP(), []int{1}
}

func (x *Property) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Property) GetType() Property_PropertyType {
	if x != nil {
		return x.Type
	}
	return Property_UNSPECIFIED
}

func (x *Property) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

var File_google_api_consumer_proto protoreflect.FileDescriptor

var file_google_api_consumer_proto_rawDesc = []byte{
	0x0a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6f, 0x6e,
	0x73, 0x75, 0x6d, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x22, 0x49, 0x0a, 0x11, 0x50, 0x72, 0x6f, 0x6a, 0x65,
	0x63, 0x74, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x12, 0x34, 0x0a, 0x0a,
	0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x14, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x50, 0x72,
	0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x52, 0x0a, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69,
	0x65, 0x73, 0x22, 0xc5, 0x01, 0x0a, 0x08, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x12,
	0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x35, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x21, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x50,
	0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x2e, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79,
	0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x4c, 0x0a, 0x0c,
	0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x54, 0x79, 0x70, 0x65, 0x12, 0x0f, 0x0a, 0x0b,
	0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x09, 0x0a,
	0x05, 0x49, 0x4e, 0x54, 0x36, 0x34, 0x10, 0x01, 0x12, 0x08, 0x0a, 0x04, 0x42, 0x4f, 0x4f, 0x4c,
	0x10, 0x02, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x54, 0x52, 0x49, 0x4e, 0x47, 0x10, 0x03, 0x12, 0x0a,
	0x0a, 0x06, 0x44, 0x4f, 0x55, 0x42, 0x4c, 0x45, 0x10, 0x04, 0x42, 0x68, 0x0a, 0x0e, 0x63, 0x6f,
	0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x42, 0x0d, 0x43, 0x6f,
	0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67,
	0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_api_consumer_proto_rawDescOnce sync.Once
	file_google_api_consumer_proto_rawDescData = file_google_api_consumer_proto_rawDesc
)

func file_google_api_consumer_proto_rawDescGZIP() []byte {
	file_google_api_consumer_proto_rawDescOnce.Do(func() {
		file_google_api_consumer_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_consumer_proto_rawDescData)
	})
	return file_google_api_consumer_proto_rawDescData
}

var file_google_api_consumer_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_api_consumer_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_api_consumer_proto_goTypes = []interface{}{
	(Property_PropertyType)(0), // 0: google.api.Property.PropertyType
	(*ProjectProperties)(nil),  // 1: google.api.ProjectProperties
	(*Property)(nil),           // 2: google.api.Property
}
var file_google_api_consumer_proto_depIdxs = []int32{
	2, // 0: google.api.ProjectProperties.properties:type_name -> google.api.Property
	0, // 1: google.api.Property.type:type_name -> google.api.Property.PropertyType
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_api_consumer_proto_init() }
func file_google_api_consumer_proto_init() {
	if File_google_api_consumer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_consumer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ProjectProperties); i {
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
		file_google_api_consumer_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Property); i {
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
			RawDescriptor: file_google_api_consumer_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_consumer_proto_goTypes,
		DependencyIndexes: file_google_api_consumer_proto_depIdxs,
		EnumInfos:         file_google_api_consumer_proto_enumTypes,
		MessageInfos:      file_google_api_consumer_proto_msgTypes,
	}.Build()
	File_google_api_consumer_proto = out.File
	file_google_api_consumer_proto_rawDesc = nil
	file_google_api_consumer_proto_goTypes = nil
	file_google_api_consumer_proto_depIdxs = nil
}
