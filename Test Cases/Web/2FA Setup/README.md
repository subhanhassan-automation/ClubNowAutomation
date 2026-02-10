# Two-Factor Authentication (2FA) Setup Automation

## Overview
This folder contains automation test cases and objects for verifying the Two-Factor Authentication setup functionality in the ClubNow application.

## Object Repository Elements

Located in `Object Repository/Page_NS - 2FA Setup/`:

1. **img_QRCode_2FA.rs** - QR code image for scanning with authenticator apps
2. **text_ScanQRCode.rs** - "Scan the QR code" heading text
3. **text_AuthenticatorInstructions.rs** - Instructions for using authenticator apps
4. **text_UnableToScan.rs** - "Unable to scan" message text
5. **link_ManualConfiguration.rs** - Link to manual configuration/setup key
6. **text_SetupKey.rs** - Setup key/secret code for manual entry
7. **input_VerificationCode.rs** - Input field for verification code from authenticator
8. **button_Continue.rs** - Continue/Verify button to complete setup

## Test Cases

Located in `Test Cases/Web/2FA Setup/`:

### 1. Verify 2FA Setup Page
**Purpose**: Validates that all required elements are present on the 2FA setup page

**Verifies**:
- QR code is displayed
- Heading "Scan the QR code" is present
- Authenticator instructions are shown
- "Unable to scan" option is available
- Manual configuration link is clickable
- Setup key is displayed when manual option is selected

**Usage**: Run this test to ensure the 2FA setup page loads correctly with all necessary elements.

### 2. Complete 2FA Setup Flow
**Purpose**: End-to-end test for the complete 2FA setup process

**Flow**:
1. Verify 2FA setup page is displayed
2. Verify QR code is visible
3. Verify authenticator instructions
4. Enter verification code (placeholder in test)
5. Verify and click Continue button

**Usage**: Demonstrates the full user journey from viewing QR code to submitting verification code.

**Note**: In production, you would need to:
- Generate actual TOTP codes from the secret key
- Integrate with a TOTP library or service
- Verify successful setup completion

### 3. Verify Manual Configuration
**Purpose**: Tests the alternative flow for users who cannot scan QR codes

**Flow**:
1. Verify initial 2FA page elements
2. Check "Unable to scan" message
3. Click manual configuration link
4. Verify setup key is displayed
5. Validate setup key format and length
6. Confirm verification code input is still accessible

**Usage**: Run this test to ensure users have a fallback option if QR scanning fails.

## Supported Authenticator Apps

The 2FA setup page supports various authenticator apps and browser extensions:
- 1Password
- Authy
- Microsoft Authenticator
- Google Authenticator
- Any TOTP-compatible authenticator

## Implementation Notes

### Selectors Used
The object repository elements use multiple selector strategies for reliability:
- **XPATH**: Primary selector using text content or attributes
- **CSS**: Alternative selector using classes or IDs
- **Smart Locator**: Katalon's AI-powered locators for resilience

### Test Execution Tips

1. **Prerequisites**: User should be navigated to the 2FA setup page (typically from account settings or during initial setup)

2. **Test Data**: For actual testing with verification codes:
   - Store test account secrets securely
   - Use a TOTP generator library (e.g., Java's `jOTP` or similar)
   - Generate time-based codes dynamically

3. **Failure Handling**: Tests use `CONTINUE_ON_FAILURE` to allow verification of all elements even if some fail

4. **Wait Times**: Appropriate delays are added for UI transitions, especially when toggling manual configuration

## Future Enhancements

Potential improvements for the 2FA automation:

1. **TOTP Code Generation**: Integrate a TOTP library to generate actual verification codes
2. **Recovery Codes**: Add test cases for backup/recovery codes display and storage
3. **Disable 2FA**: Create test cases for disabling 2FA
4. **Error Scenarios**: Test invalid codes, expired codes, rate limiting
5. **Mobile Testing**: Extend to iOS and Android apps if they support 2FA
6. **Security Validation**: Verify HTTPS, secure cookie handling, etc.

## Related Test Cases

- `Test Cases/Web/Login/login.tc` - Login flow (may require 2FA after setup)
- Future: Login with 2FA verification test case

## Maintenance

When updating these tests:
1. Verify selectors still match the actual page elements
2. Update element GUIDs if creating new object repository entries
3. Adjust wait times based on application performance
4. Keep test data (codes, secrets) secure and never commit them to version control

## Contact

For questions or issues related to 2FA automation, refer to the main project documentation or contact the automation team.
