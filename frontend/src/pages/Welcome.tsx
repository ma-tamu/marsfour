import {
    AppBar,
    Box,
    Button,
    Card,
    CardContent,
    Container,
    CssBaseline,
    Grid,
    List,
    ListItem,
    ListItemText,
    Toolbar,
    Typography
} from "@mui/material";

function Copyright(props: any) {
    return (
        <Typography variant="body2" color="text.secondary" align="center" {...props}>
            {'Copyright © Planet System 2023 -'}
        </Typography>
    );
}

function Welcome() {

    return (
        <>
            <Box sx={{display: 'flex'}}>
                <CssBaseline/>
                <AppBar position="fixed">
                    <Toolbar>
                        <Typography variant="h6" noWrap component="div">
                            Mars-Four
                        </Typography>
                    </Toolbar>
                </AppBar>
            </Box>
            <Container component="main" maxWidth="xs">
                <CssBaseline/>
                <Box sx={{
                    marginTop: 18,
                    display: 'flex',
                    flexDirection: 'column',
                    alignItems: 'center',
                    justifyContent: 'center'
                }}>
                    <Card sx={{backgroundColor: '#fcfcfc', minWidth: 500, textAlign: 'center'}}>
                        <CardContent>
                            <Typography component="h1" variant="h4">
                                Welcome Mars-Four
                            </Typography>
                            <Box >
                                <Grid>
                                    <Grid item xs={12} md={6} sx={{textAlign: 'center'}}>
                                        <Typography sx={{mt: 4, mb: 2}} variant="h6" component="div">
                                            推奨ブラウザ
                                        </Typography>
                                        <List>
                                            <ListItem>
                                                <ListItemText sx={{textAlign: 'center'}}>Chrome(最新)</ListItemText>
                                            </ListItem>
                                            <ListItem>
                                                <ListItemText sx={{textAlign: 'center'}}>FireFox(最新)</ListItemText>
                                            </ListItem>
                                        </List>
                                    </Grid>
                                </Grid>
                                <Button type="button" variant="contained" sx={{mt: 3, mb: 2}}>Authenticate</Button>
                            </Box>
                            <Copyright sx={{mt: 8, mb: 4}}/>
                        </CardContent>
                    </Card>
                </Box>
            </Container>
        </>
    );
}

export default Welcome;