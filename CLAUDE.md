# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Kotlin library that converts integers to Vietnamese number words. The library supports numbers from 0 to 1,000,000 and handles Vietnamese-specific pronunciation rules for numbers (e.g., special pronunciations for 1, 5, 10 in different contexts).

## Common Commands

### Build and Test
```bash
./gradlew build          # Build the project
./gradlew test           # Run all tests
./gradlew clean build    # Clean build from scratch
```

### Single Test Execution
```bash
./gradlew test --tests "NumberToVietnameseTest.num15"  # Run specific test method
./gradlew test --tests "NumberToVietnameseTest"        # Run specific test class
```

### Publishing
```bash
./gradlew publishToMavenLocal  # Publish to local Maven repository
```

## Code Architecture

### Core Components

1. **NumberToVietnamese.kt** - Main entry point with `numberToVietnamese(num: Int)` function
2. **NumberForVietnamese.kt** - Core conversion logic with Vietnamese pronunciation rules
3. **NumberToPositions.kt** - Utility for breaking numbers into digit positions

### Key Design Patterns

- **Factory Pattern**: `NumberForVietnamese.from(num)` creates instances
- **Rule-based Translation**: `withoutPrefix()` function handles Vietnamese-specific number pronunciation rules
- **Position-based Processing**: Numbers are converted to digit arrays for processing

### Vietnamese Number Rules Implemented

- Special handling for 10 ("mười" vs "mươi")
- Special pronunciation for 5 in tens position ("lăm") 
- Special pronunciation for 1 in ones position with tens ("mốt")
- "lẻ" (odd/remaining) insertion for hundreds with missing tens (e.g., 103 = "một trăm lẻ ba")

### Test Structure

Tests cover edge cases for Vietnamese number pronunciation rules, including:
- Basic digits (0-9)
- Teens (10-19) with special "mười" handling
- Tens with special pronunciations (21 = "hai mươi mốt")
- Hundreds with gaps (103 = "một trăm lẻ ba")
- Thousands and millions

## Project Configuration

- **Language**: Kotlin 1.9.23
- **JVM Target**: 11
- **Group ID**: com.github.sanemat
- **Artifact ID**: maven-number-to-vietnamese
- **Current Version**: 0.5.0 (managed via git tags)
- **Publishing**: Maven publication configured for JitPack distribution