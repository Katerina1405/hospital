package com.solvd.hospital.general;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum  Gender {;

    private static Map<Byte, Gender> codeMap;
    static {
        codeMap = Arrays.stream(values()).collect(Collectors.toMap(
                (Gender gender) -> gender.getCode(), Function.identity()
        ));
    }

    public static Gender getGenderByCode(int code) {
        return codeMap.get((byte)code);
    }

    private byte code;

    Gender(int code) {
        this.code = (byte)code;
    }

    public byte getCode() {
        return code;
    }
}