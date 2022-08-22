const { Browser } = require('puppeteer-core');
const LoginPage = require('../pageobjects/login.page');
const SecurePage = require('../pageobjects/secure.page');
import allureReporter from '@wdio/allure-reporter'

describe('My Login application1', () => {
    it('should login with valid credentials', async () => {
        allureReporter.addFeature('Feature')
        await LoginPage.open();

        await LoginPage.login('tomsmith', 'SuperSecretPassword!');
        await expect(SecurePage.flashAlert).toBeExisting();
        await expect(SecurePage.flashAlert).toHaveTextContaining(
            'You logged into a secure area!');
            browser.pause(100000);
    });
});
